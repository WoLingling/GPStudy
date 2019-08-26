package com.wangling.designermode.delegate.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet extends HttpServlet {

    private List<Handle> handleMapping = new ArrayList<Handle>();

    public void init(){
        try{
            Class<?> memberControllerClass = MemberController.class;
            handleMapping.add(new Handle()
                    .setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("getMemberById.do"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req,resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String url = req.getRequestURI();
        Handle handle = null;
        for (Handle h : handleMapping) {
            if (h.getUrl().equals(url)){
                handle = h;
            }
        }

        try {
            Object object = handle.getMethod().invoke(handle.getController(),req.getParameter("mid"));
            resp.getWriter().write(object.toString());

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    class Handle{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handle setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handle setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handle setUrl(String url) {
            this.url = url;
            return this;
        }
    }

    //    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String uri = req.getRequestURI();
//        String mid = req.getParameter("mid");
//
//        if ("getMemberById".equals(uri)){
//            new MemberController().getMemberById(mid);
//        }else if("OrderController".equals(uri)){
//            new OrderController().getOrderById(mid);
//        }else if ("".equals(uri)){
//            new SystemController().logout();
//        }else {
//            resp.getWriter().write("404 Not Found!");
//        }
//    }

}

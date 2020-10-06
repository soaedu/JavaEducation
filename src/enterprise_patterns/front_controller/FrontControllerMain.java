package enterprise_patterns.front_controller;

import enterprise_patterns.front_controller.front_controller.FrontController;

public class FrontControllerMain {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}

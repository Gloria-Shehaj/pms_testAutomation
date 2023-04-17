package pms_completetest.pom.resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pms_completetest.pom.base.BasePage;
import pms_completetest.pom.base.BaseTest;

import java.io.IOException;

public class listeners {


    public  class Listeners extends BaseTest implements ITestListener {

        public Listeners() throws IOException {
            super();
            // TODO Auto-generated constructor stub
        }


        @Override
        public void onTestFailure(ITestResult result) {

            try {
                takeSnapShot(result.getName());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onTestStart(ITestResult result) {
            // TODO Auto-generated method stub

        }
        @Override
        public void onTestSuccess(ITestResult result) {
            // TODO Auto-generated method stub

        }
        @Override
        public void onTestSkipped(ITestResult result) {
            // TODO Auto-generated method stub

        }
        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
            // TODO Auto-generated method stub

        }
        @Override
        public void onStart(ITestContext context) {
            // TODO Auto-generated method stub

        }
        @Override
        public void onFinish(ITestContext context) {
            // TODO Auto-generated method stub

        }




    }


}

package com.runner;

import org.testng.annotations.*;

import java.io.IOException;

public class Setup_DockerGrid {

    @BeforeTest
    void startDockerGrid () throws IOException, InterruptedException
    {
        Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
        Thread.sleep (20000);
    }

    @AfterTest
    void stopDockerGrid() throws IOException, InterruptedException
    {
        Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
        Thread.sleep(5000);
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); //closes command prompt
    }

}

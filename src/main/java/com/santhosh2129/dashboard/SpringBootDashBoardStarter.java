package com.santhosh2129.dashboard;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by santhosh on 7/1/17.
 */

@SpringBootApplication
@EnableMicroservicesDashboardServer
@EnableDiscoveryClient
public class SpringBootDashBoardStarter {
    public static void main(String[] arg) {
        SpringApplication.run(SpringBootDashBoardStarter.class, arg);
    }
}

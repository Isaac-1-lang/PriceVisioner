package com.pricevisioner.pv;

import org.springframework.boot.SpringApplication;

public class TestPvApplication {

    public static void main(String[] args) {
        SpringApplication.from(PvApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

package com.matheuscordeiro;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class FoodAppAwsInfraApp {
    public static void main(final String[] args) {
        App app = new App();
        new FoodAppVpcStack(app, "Vpc");
        app.synth();
    }
}

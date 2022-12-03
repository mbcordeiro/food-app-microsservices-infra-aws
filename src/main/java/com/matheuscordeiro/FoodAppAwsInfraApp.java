package com.matheuscordeiro;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class FoodAppAwsInfraApp {
    public static void main(final String[] args) {
        App app = new App();
        final FoodAppVpcStack vpc = new FoodAppVpcStack(app, "Vpc");
        new FoodAppClusterStack(app, "Cluster", vpc.getVpc());
        app.synth();
    }
}

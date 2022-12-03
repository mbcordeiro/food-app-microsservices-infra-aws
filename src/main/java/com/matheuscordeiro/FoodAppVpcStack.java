package com.matheuscordeiro;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.constructs.Construct;

public class FoodAppVpcStack extends Stack {
    private final Vpc vpc;

    public FoodAppVpcStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public FoodAppVpcStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);
        vpc = Vpc.Builder.create(this, "FoodAppVpc")
                .maxAzs(3)
                .build();
    }

    public Vpc getVpc() {
        return vpc;
    }
}

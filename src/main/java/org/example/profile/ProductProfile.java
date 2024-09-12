package org.example.profile;

public class ProductProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
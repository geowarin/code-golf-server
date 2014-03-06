package com.geowarin.redirect;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.net.URI;

public interface RedirectService {

    String getRedirectUrl(URI baseUri);

    @Service
    @Profile("default")
    public class DevRedirectService implements RedirectService {

        @Override
        public String getRedirectUrl(URI baseUri) {
            return "dev";
        }
    }

    @Service
    @Profile("prod")
    public class ProductionRedirectService implements RedirectService {

        @Override
        public String getRedirectUrl(URI baseUri) {
            return "prod";
        }
    }
}

package org.parasol.customerservice.website.mcp;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;
import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebsiteMcpServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebsiteMcpServer.class);

    @Tool(name = "password_reset", description = "Reset password based on provided email address")
    public String passwordReset(@ToolArg(description = "Email address of the user requesting password reset", required = true) String email) {
        LOGGER.info("password_reset Tool invoked for email address {}", email);
        return new JsonObject().put("message", "Password reset link sent.").put("email", email).encode();
    }
}

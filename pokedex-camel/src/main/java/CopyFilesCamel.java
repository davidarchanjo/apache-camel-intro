import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import lombok.SneakyThrows;

public class CopyFilesCamel {

    @SneakyThrows
    public static void main(String[] args) {
        CamelContext camelContext = new DefaultCamelContext();

        camelContext.addRoutes(new RouteBuilder() {
            public void configure() throws Exception {
                from("file:input")
                    .to("file:output");
            }
        });

        camelContext.start();
        Thread.sleep(5000);
        camelContext.stop();
    }
}

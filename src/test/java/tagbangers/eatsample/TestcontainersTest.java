package tagbangers.eatsample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
public class TestcontainersTest {
    // container {
    @Container
    public GenericContainer container = new GenericContainer(DockerImageName.parse("elasticsearch:7.6.2"))
            .withExposedPorts(9200)
            .withCommand("--name=esTest -e \"discovery.type=single-node\"");
//    public GenericContainer container = new GenericContainer(DockerImageName.parse("redis:5.0.3-alpine"))
//            .withExposedPorts(6379);

    @BeforeEach
    public void setUp() {
        String address = container.getHost();
        Integer port = container.getFirstMappedPort();

        // Now we have an address and port for Redis, no matter where it is running
//        underTest = new RedisBackedCache(address, port);
    }

    @Test
    public void testTest() {
        while (true);
    }
}

package dns;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import javax.inject.Inject;

@Command(name = "dns", description = "...",
        mixinStandardHelpOptions = true)
public class DnsCommand implements Runnable {

    @Inject DNSClient dnsClient;
    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DnsCommand.class, args);
    }

    public void run() {
        dnsClient.resolve("example.com", "A").blockingFirst().answer.forEach(
                answer -> System.out.println(answer.data)
        );
    }
}

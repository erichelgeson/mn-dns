package dns;

import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

@Client("https://cloudflare-dns.com")
@Consumes("application/dns-json")
public interface DNSClient {
    @Get("/dns-query")
    Flowable<DNSResponse> resolve(@QueryValue String name, @QueryValue String type);
}
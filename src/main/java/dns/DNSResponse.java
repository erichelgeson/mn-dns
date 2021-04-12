package dns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DNSResponse {
    @JsonProperty("Status")
    public String status;
    public Boolean TC;
    public Boolean RD;
    public Boolean RA;
    public Boolean AD;
    public Boolean CD;
    @JsonProperty("Question")
    public List<Question> question;
    @JsonProperty("Answer")
    public List<Answer> answer;
}


//{
//  "Status": 0,
//  "TC": false,
//  "RD": true,
//  "RA": true,
//  "AD": true,
//  "CD": false,
//  "Question": [
//    {
//      "name": "example.com.",
//      "type": 28
//    }
//  ],
//  "Answer": [
//    {
//      "name": "example.com.",
//      "type": 28,
//      "TTL": 1726,
//      "data": "2606:2800:220:1:248:1893:25c8:1946"
//    }
//  ]
//}
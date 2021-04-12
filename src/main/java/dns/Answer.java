package dns;

public class Answer {
    public String name;
    public Integer type;
    public Long TTL;
    public String data;

}

//  "Answer": [
//    {
//      "name": "example.com.",
//      "type": 28,
//      "TTL": 1726,
//      "data": "2606:2800:220:1:248:1893:25c8:1946"
//    }
//  ]
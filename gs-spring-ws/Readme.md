#Sping-WS getting stareted examples

adapted from :

## gs-ws-producer 
slightly adapted from : https://spring.io/guides/gs/producing-web-service/
##gs-ws-consumer 
slightly adapted from :https://spring.io/guides/gs/consuming-web-service/
##gs-ws-consumer-aug :
##gs-ws-consumer-aug : 
The above example improved to:
1. coonsumer - compile without the producer running
2. Log requests/responses through logger config
3. Externalize in configuration Producer URL 
4. Improper xsd in client: meta field in Request defined as sting when in practice is a complex type (IP, datetime), xsd definition missing in client

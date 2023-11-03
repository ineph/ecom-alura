## Aprendendo Kafka

### Criando tópico:
Passos em ambiente linux:

1. Instale o [Kafka](https://kafka.apache.org/downloads) localmente
2. Navegue até o local da instalação
3. Inicialize o Zookeeper: <br>`bin/zookeeper-server-start.sh config/zookeeper.properties`
4. Inicialize o Kafka:<br>`bin/kafka-server-start.sh config/server.properties`
5. Crie um tópico (o nome do tópico utilizado no projeto por enquanto está fixo):
<br>`bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic ECOMMERCE_NEW_ORDER`

### Acompanhando recebimento das mensagens:
Apesar do projeto printar o envio e recebimento das mensagens, é possível acompanhar pelo console:
<br>`bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic ECOMMERCE_NEW_ORDER`

É possível enviar mensagens diretamente pelo console:
<br>`bin/kafka-console-producer.sh --broker-list localhost:9092 --topic NOME_DO_TOPICO`
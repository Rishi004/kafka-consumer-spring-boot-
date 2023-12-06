# kafka-consumer-spring-boot

--> Learning Kafka - Spring boot

# Kafka Commands for Windows
--> start zookeeper

./bin/windows/zookeeper-server-start.bat ./config/zookeeper.properties default port -> 2181

--> start kafka server / broker

./bin/windows/kafka-server-start.bat ./config/server.properties default port -> 9092

--> create topics

./bin/windows/kafka-topics.bat --bootstrap-server localhost:9092 --create --topic first-topic --partitions 3 --replication-factor 1

--> view topic list

./bin/windows/kafka-topics.bat --bootstrap-server localhost:9092 --list

--> describe topic

./bin/windows/kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic first-topic

--> start producer console

./bin/windows/kafka-console.producer.bat --broker-list localhost:9092 --topic first-topic

--> upload csv file when start producer console

./bin/windows/kafka-console.producer.bat --broker-list localhost:9092 --topic first-topic </path/to/file.csv

--> start consumer console

./bin/windows/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first-topic --from-beginning

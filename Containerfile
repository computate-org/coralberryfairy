FROM registry.access.redhat.com/ubi9/openjdk-21:latest

USER root

RUN microdnf install -y git

RUN install -d /home/default/coralberryfairy
COPY . /home/default/coralberryfairy

RUN git clone https://github.com/computate-org/computate-base.git /home/default/computate-base
RUN git clone https://github.com/computate-org/computate-search.git /home/default/computate-search
RUN git clone https://github.com/computate-org/computate-vertx.git /home/default/computate-vertx
RUN git clone https://github.com/computate-org/coralberryfairy-static.git /home/default/coralberryfairy-static

WORKDIR /home/default/computate-base
RUN mvn clean install -DskipTests
WORKDIR /home/default/computate-search
RUN mvn clean install -DskipTests
WORKDIR /home/default/computate-vertx
RUN mvn clean install -DskipTests
WORKDIR $HOME/coralberryfairy
RUN mvn clean install -DskipTests

WORKDIR /home/default/coralberryfairy
RUN mvn clean install -DskipTests
RUN mvn dependency:build-classpath -Dmdep.outputFile=/home/default/coralberryfairy/cp.txt -q
CMD java -cp "$(cat /home/default/coralberryfairy/cp.txt):/home/default/coralberryfairy/target/classes" com.coralberryfairy.site.verticle.MainVerticle

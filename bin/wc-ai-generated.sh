echo AI generated
find \
  ~/.local/src/coralberryfairy/pom.xml \
  ~/.local/src/coralberryfairy/Containerfile \
  ~/.local/src/coralberryfairy/pom.xml \
  ~/.local/src/coralberryfairy/.gitignore \
  ~/.local/src/coralberryfairy/bin/ \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/config/ \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/model/BaseModel.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/page/ \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/request/ \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/result/ \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/user/ \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/verticle/MainVerticle.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/verticle/WorkerVerticle.java \
  ~/.local/src/coralberryfairy/src/main/resources/ \
  ~/.local/src/coralberryfairy/src/gen/ \
  ~/.local/src/coralberryfairy-static/webawesome/css/ \
  ~/.local/src/coralberryfairy-static/webawesome/fiware/ \
  ~/.local/src/coralberryfairy-static/webawesome/js/ \
  -type f -exec wc -l {} +
echo AI generated

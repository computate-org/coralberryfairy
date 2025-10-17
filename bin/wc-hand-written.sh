echo hand written
find \
  ~/.local/src/coralberryfairy/vars.yaml \
  ~/.local/src/coralberryfairy/README.md \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/verticle/SiteRoutes.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/page/SitePage.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/page/SitePagePage.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/page/SitePageEnUSApiServiceImpl.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/model/doll/Doll.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/model/doll/DollPage.java \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/model/doll/DollEnUSApiServiceImpl.java \
      -type f -exec wc -l {} +
echo hand written

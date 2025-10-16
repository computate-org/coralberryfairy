echo hand written
find \
  ~/.local/src/coralberryfairy/vars.yaml \
  ~/.local/src/coralberryfairy/README.md \
  ~/.local/src/coralberryfairy/src/main/java/com/coralberryfairy/site/verticle/SiteRoutes.java \
      -type f -exec wc -l {} +
echo hand written

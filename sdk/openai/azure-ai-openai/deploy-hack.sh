mvn deploy:deploy-file \
    -DskipTests \
    -Dfile=target/azure-ai-openai-1.0.0-beta.6-edina.jar \
    -DrepositoryId=edina-repository \
    -Durl=scpexe://geodev.edina.ac.uk/var/www/html/maven-repository \
    -DartifactId=azure-ai-openai \
    -DgroupId=com.azure \
    -DpomFile=pom.xml \
    -Dsources=target/azure-ai-openai-1.0.0-beta.6-edina-sources.jar \
    -Dversion=1.0.0-beta.6-edina

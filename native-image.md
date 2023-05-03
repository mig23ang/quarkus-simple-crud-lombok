## 1

Abrir consola x64 native


Navegue a la ruta del proyecto


echo %GRAALVM_HOME%

gu install native-image

native-image --version

## 2



mvn package -Pnative

docker build -f src/main/docker/Dockerfile.native -t quarkus/nombre de la imagen .

docker run -i --rm -p 8080:8080 quarkus/nombre de la imagen
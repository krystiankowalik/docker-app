FROM openjdk:8-jre-alpine

ARG JAR_FILE
ENV BASE_PATH="/app"
ENV ENTRYPOINT_PATH=${BASE_PATH}/entrypoint.sh

COPY "./target/${JAR_FILE}" "${BASE_PATH}/"

RUN echo "#!/bin/sh "$'\n'" java -jar /app/${JAR_FILE}" > ${ENTRYPOINT_PATH}
RUN chmod +x ${ENTRYPOINT_PATH}

ENTRYPOINT ${ENTRYPOINT_PATH}
EXPOSE 8080

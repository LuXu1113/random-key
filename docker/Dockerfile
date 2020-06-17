FROM node:8.3

RUN mkdir -p /app/random-key/bin
ADD ./bin/random-key /app/random-key/bin/random-key
ADD ./etc/random-key /etc/default/random-key
ADD ./init.d/random-key /etc/init.d/random-key

WORKDIR /app/random-key

CMD ["/etc/init.d/random-key start"]
EXPOSE 1234

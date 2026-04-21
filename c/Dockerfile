FROM gcc:latest

WORKDIR /usr/src/app

COPY . .

RUN gcc sum.c -o sum

CMD ["./sum"]
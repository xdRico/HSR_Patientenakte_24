FROM postgres:16.2

ENV POSTGRES_USER="admin"
ENV POSTGRES_PASSWORD="secret"
ENV POSTGRES_DB="todo"

COPY ./*.sql /docker-entrypoint-initdb.d/
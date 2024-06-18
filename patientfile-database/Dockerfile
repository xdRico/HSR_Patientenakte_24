FROM postgres:16.2

ENV POSTGRES_USER="admin"
ENV POSTGRES_PASSWORD="secret"
ENV POSTGRES_DB="patientfile"

COPY ./*.sql /docker-entrypoint-initdb.d/
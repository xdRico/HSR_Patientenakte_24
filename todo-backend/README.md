# todo-backend
## How to build and containerize this application

1. Generate an executable jar file using maven

    Enter project directory: `cd todo-backend`
    Execute maven clean package: `./mvnw clean package`

    Maven clean: Cleans the project, deletes old files
    Maven package: Compiles our source code and creates an executable .jar file in the target/ directory

2. Build the docker image using `docker build -t todo-backend:0.0.1`
3. Verify that the image is there with `docker images`
4. Run the docker image by running `docker run -p 8080:8080 todo-backend:0.0.1`
5. Verify the container is running correctly with `curl localhost:8080/hello` it should output "Hello World!"
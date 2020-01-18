# ADA - Architectural Design Advisor

### The repository of ADA, the Architectural Design Advisor

## General Information


The project and sprint backlogs can be found on the project's [Trello board](https://trello.com/invite/b/CHtfAIFN/d2ebc24144c32afd61693a4605d8c898/ada), and the group report on [Overleaf](https://www.overleaf.com/read/fcsmpbsrfndf).

The project uses [a simple Java Android application](https://github.com/alexandar1000/ADA-test-simple-Java-project) for testing.

## Getting Started

### Prerequisites

In order to get the project started you will need to install [docker](https://www.docker.com/) 19+ installed, along with [compose](https://docs.docker.com/compose/install/). 

Furthermore, this project uses [java 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html), so please make sure that you have it installed prior to development.

Finally, depending on your environment, you might need to install [maven](https://maven.apache.org/)

### Setting up the project

In order to set up the project and get ready for development, follow these steps:
1. Pull the Git repository.
2. Import the project to your IDE using the `pom.xml` file.
3. Execute the docker-compose.yml file via running the `docker-compose up -d` command. You should be able to see that both the `postgres` and the `pgadmin` containers are running.
4. Open `pgadmin` by visiting `localhost:15050`. You can log in using the credidentials as stated in the `docker-compose.yml`.
    - **Email**: `ada-team@gmail.com`
    - **Password**: `ada-team`
 5. Once `pgadmin` is running connect to a server with the following credentials:
    - **Name**: `ada-team`
    - **Host name/address**: `postgres_container`
    - **Port**: `5432`
    - **Maintenance Database**: `ada`
    - **Username**: ada-team
    - **Password**: `1234`
 
    and press `Save`.
6. Run the application with the `./mvnw spring-boot:run` command.
7. Open `localhost:8080` and enjoy the masterpiece.

### Possible Additional Setup

If you are using IntelliJ, you can similarily connect to PostgreSQL through it. 

Also, using Maven is a lot easier through IntelliJ.

## Deployment

Deployment has not yet been dockerized, but will come soon.

## Development Instructions

1. Writing unit tests is mandatory for all features which are written.
2. Code review and an approval are mandatory before a merge.
3. Master branch is to be updated only in the end of a sprint. 
4. During the sprints all new features are to be developed on branches branching out from development, and are to be mearged back into development.
5. Prefix your branch names with your initials. An example would be: `asj_simpleBranchExample`.
6. Adhere to the migration instructions found in the following section.
7. Please actively use Trello and mark the features which you are working on in order not to have overlaps.
8. If you believe new tasks should be added to the Trello board, please feel free to add them to the `project backlog`.
9. Ask for help whenever you are stuck. Also, if you feel that you are progressing a bit slower, please feel free to mention it as soon as possible.

## Migration Instructions

All of the migrations should be saved in a `.sql` file and in the `migrations` folder. More precisely, in the `migrations` folder, they should be placed in the folder `done` if they have been integrated in the deployed database, or under `pending` if they are yet to be integrated in the deployed database.

This should be done in order to populate the database once the server is deployed, and to be able to restore the database in the event of an failure.

The naming convention for the migrations should be as follows. The names should state the year, month, day, initials, number, and the name of the migration. Please take care of the leading zeros, and also keep in mind that the migration numbers are related only to your migrations, and are reset with different dates. An example for this would be: `2020_01_18_asj_000_sample_migration_name`.
 
## Helpful Docker Commands

- Starting the database containers: `docker-compose up -d`
- Stopping the database containers: `docker-compose stop`
- Removing the database containers: `docker-compose down`
- Pruning everything docker related: `docker system prune`
- Pruning the volumes: `docker volume prune`

Furthermore, a useful docker cheat sheet can be found [here](https://afourtech.com/guide-docker-commands-examples/).

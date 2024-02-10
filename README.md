# Task Management Application
This is a simple Task Management application built with Spring Boot. The application allows users to manage tasks, mark tasks as completed or incomplete, and perform CRUD operations on tasks.

## Table of Contents

- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)


## Getting Started

### Prerequisites

- [Java](https://www.java.com/) installed on your machine
- [Maven](https://maven.apache.org/) for building and managing the project
- [Git](https://git-scm.com/) for version control
- [Mysql]() database


### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/skmanoj322/Todo-app

2. Navigate to the project directory:

   ```bash
   cd Todo-app

3. Build the project using Maven

    ```bash
   mvn clean install

4. Run the application:

    ```bash
   mvn clean install

The application should now be running locally.

## Usage

The Task Management Application provides simple CRUD (Create, Read, Update, Delete) operations for managing tasks. Below are the main features and instructions on how to use the application:

### 1. **Get All Tasks**

- **Endpoint:** `GET /api/v1/tasks/`
- **Description:** Retrieve a list of all tasks.

   ```bash
   curl -X GET http://localhost:8080/api/v1/tasks/

### 2. **Add a New Task**


- **Endpoint**: `POST /api/v1/tasks/`

- **Description**: Create a new task by providing task details in the request body.

   ```bash
   curl -X POST -H "Content-Type: application/json" -d '{"task":"New Task","completed":false}' http://localhost:8080/api/v1/tasks/

### 3. **Edit a Task**


- **Endpoint**: `PUT /api/v1/tasks/{id}`

- **Description**:  Update an existing task by providing the task ID in the URL and the updated task details in the request body.
   ```bash
  curl -X PUT -H "Content-Type:application/json" -d '{"task":"Updated Task","completed":true}' http://localhost:8080/api/v1/tasks/1

### 4. **Delete a Task**

- **Endpoint:** `DELETE /api/v1/tasks/{id}`
- **Description:** Delete a task by providing the task ID in the URL.

   ```bash
   curl -X DELETE http://localhost:8080/api/v1/tasks/1
## Endpoints

#### Get all Todos

```http
  GET /api/vi/tasks/
```

#### Insert new Todo

```http
  POST /api/vi/tasks/
```

#### Delete Todo

```http
  /api/v1/tasks/{id}
```

#### Update Todo

```http
  PUT /api/vi/tasks/{id}
```

## Contributing

Feel free to contribute to this project. Fork the repository, make your changes, and submit a pull request.

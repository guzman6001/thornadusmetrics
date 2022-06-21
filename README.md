# Thornadus Metrics
Save easily your metrics with Thornadus

### Download
> $ git clone https://github.com/guzman6001/thornadusmetrics.git

### Install & Run
Spring Initializr uses maven wrapper so type this:
> $ ./mvnw clean spring-boot:run

Alternatively using your installed maven version type this:
> $ mvn clean spring-boot:run

When the app starts, we can use Postman to test the services provided.

### Services

##### Create
Create a new metric all all fields are mandatory.
- Endpoint
> localhost:8086/api/metrics
- Method **POST**
- Example request
>```
>{
>  "id": null,
>  "name": "Speed Curve 1",
>  "value": 80,
>  "timestamp": "2022-07-26T07:00:00.000+00:00"
>}
>```

##### Read / List
Read the metric identified by [ID]. Optionaly if [ID] is not sent it will return all metrics. 
- Endpoint
> localhost:8086/api/metrics/[ID]
- Method **GET**

##### Update
Update/Edit the metric identified by [ID]. Returns the metric updated. [ID] is mandatory.
- Endpoint
> localhost:8086/api/metrics/**[ID]**
- Method **PUT**
- Example request
>```
>{
>  "id": 1,
>  "name": "Speed Curve 1",
>  "value": 70,
>  "timestamp": "2022-07-26T07:00:00.000+00:00"
>}
>```

##### Delete
Delete the metric identified by [ID]. Returns the metric deleted.
- Endpoint
> localhost:8086/api/metrics/**[ID]**
- Method **DELETE**







## Auto-complete
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project is a simple autocomplete like we have at Google.

## Technologies
The project is created with:
* Java version: 23
* JUnit 
	
## How to use the project
You can use two types of this implementation or write custom logic by reusing `completeBy`
* `completByContaning`
* `completeByPrefix`

```
// Setup data
var ac = new AutoComplete();

ac.elements = List.of( ... );

// Use embedded logic
ac.completeByContaining("pro");
ac.completeByPrefix("pro");

// Create custom logic
ac.completeBy(x -> x.matches("Phone"));

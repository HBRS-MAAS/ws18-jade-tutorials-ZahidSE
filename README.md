[![Build Status](https://travis-ci.org/HBRS-MAAS/jade-tutorials.svg?branch=master)](https://travis-ci.org/HBRS-MAAS/jade-tutorials)

# Jade Tutorials

## Agents

### Seller
There are 3 seller agents. Each of these agents loads it's catalog from separate `json` files provided in `resources/catalog`.

### Buyer
The number of buyer agents depends on the input file `purchase_list.txt` which is also included in `resources`. Each line of the input file contains titles of 3 books and a buyer agent is created for each line. The buyer agent is responsible of buying 3 books listed in the corresponding line. The number of lines in `purchase_list.txt` and titles in each line are not fixed. Adding more lines will start more buyers and the buyers are able to handle purchase of any number books passed in argument.  


## Dependencies
* JADE v.4.5.0
* Java 8
* Gradle

## How to run
Just install gradle and run:

    gradle run

It will automatically get the dependencies and start JADE with the configured agents.
In case you want to clean you workspace run

    gradle clean

## Eclipse
To use this project with eclipse run

    gradle eclipse

This command will create the necessary eclipse files.
Afterwards you can import the project folder.

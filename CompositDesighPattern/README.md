## Getting Started

Write a Java program that demonstrate the implementation of a composite design pattern by using an example with a building composed of generic housing structures.

## Design Pattern Overview

The **Composite Design Pattern** is a structural pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

In this example, I create a hierarchy of housing structures, including `Room`, `Unit`, `Floor`, and `Building`, where each structure can contain other structures.

## Code Structure

- `HousingStructure` (Interface): Represents the common interface for all housing structures with an `enter()` method.
- `Room` (Class): Represents a room in the building.
- `Unit` (Class): Represents a unit or apartment that can contain multiple housing structures.
- `Floor` (Class): Represents a floor of the building, which can contain units.
- `Building` (Class): Represents the building itself, which can contain floors.
- `CompositePatternExample` (Class): Contains the `main` method to demonstrate the composite design pattern.

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Getting Started

The decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior

## Problem Statement

Write a Java program to demonstrate the implementation of a decorator pattern for a web page, which might display complex behavior, such as only allowing access to authorized users, or splitting search results across multiple pages.

## Decorator Pattern Example

The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class. This pattern is commonly used for adding functionalities to classes in a flexible and reusable way.

## Structure

In this example, we have the following classes and interfaces:

- `WebPage` (Interface): Represents the base component for web pages.
- `SimpleWebPage` (Concrete Component): Implements the `WebPage` interface, providing a basic web page.
- `WebPageDecorator` (Decorator): An abstract class that also implements the `WebPage` interface. It acts as a base class for concrete decorators.
- `AuthorizedWebPage` (Concrete Decorator): Adds authorization functionality to a web page.
- `PaginatedWebPage` (Concrete Decorator): Adds pagination functionality to a web page.

## Usage

- `SimpleWebPage` is the base component that represents a simple web page.
- `WebPageDecorator` serves as a base class for decorators. Decorators extend this class and can dynamically add functionality to web pages.
- `AuthorizedWebPage` is a concrete decorator that adds authorization functionality to web pages. It checks if the user is authorized to access the web page content.
- `PaginatedWebPage` is another concrete decorator that adds pagination to web pages, allowing search results to be split across multiple pages.

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

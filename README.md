# Java Technical Exercise - Tempo

## Project Description

This project provides a Java library for filtering a hierarchical structure of nodes based on a given predicate. It includes the `Hierarchy` interface for representing hierarchical data, the `Filter` class for node filtering, and a set of test cases.

## Task

1. Read and understand the Hierarchy data structure
   [Provided code here.](https://gist.githubusercontent.com/baltiyskiy/d5936b31806ac4288375fc7afc43b313/raw/35406359326044908d11f32d12c7b4089fa04e5c/HierarchyFilter.java) <br/>

2. Implement filter() function

3. Implement more test cases

## Implementation

1. Filter a hierarchical structure of nodes based on a given predicate.

2. Support for representing hierarchical data with the Hierarchy interface.

3. Includes test cases to ensure the correctness of the filtering.

## Usage

To filter a hierarchy of nodes, you can use the Filter.filter method, providing a Hierarchy and a predicate. Here's an example of how to use it:

```
Hierarchy unfiltered = new ArrayBasedHierarchy(/* Node and depth data here */);
Hierarchy filtered = Filter.filter(unfiltered, nodeId -> nodeId % 2 == 0);
```

## Testing

To run the test cases for the Hierarchy Filtering library, you can use your favorite Java testing framework. We've provided a sample set of test cases in the FilterTest class.


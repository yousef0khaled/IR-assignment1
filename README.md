# Information Retrieval Assignment - Inverted Index  

## Project Overview  
This project builds an **inverted index** for text files in a given directory. It scans each document, extracts words, and records:
- The number of occurrences of each word.  
- The documents where each word appears.  

A query system is implemented to retrieve files containing specific keywords using the inverted index.  

## Features  
- Builds an **inverted index** from text documents.  
- Supports searching for documents that contain given keywords.  
- Implements intersection operations for efficient retrieval.  
- Outputs indexed words and their corresponding document lists.  

## Requirements  
- **Programming Language**: Java  
- **IDE**: Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans)  
- **No external libraries required**  

## Files Description  
- `index5.java`  
  - Implements methods for building and querying the inverted index.  
  - **Methods to complete**:  
    - `intersect(Posting pL1, Posting pL2)`: Finds common documents between two posting lists.  
    - `buildIndex(String[] files)`: Reads documents and constructs the inverted index.  
    - `printPostingList(Posting p)`: Displays the posting list without the trailing comma.  
    - All methods should be commented for clarity.  

- `Test.java`  
  - Contains the `main` method to run the project.  
  - Reads input files and executes queries.  

- `index.txt`  
  - Stores indexed document paths.  

- `build.xml`  
  - Used for project build automation.  

## How to Run  
1. Compile the Java files:  
   ```sh  
   javac index5.java Test.java  
   ```  
2. Run the program with test files:  
   ```sh  
   java Test  
   ```  
3. Enter queries to retrieve matching documents.  

## Expected Output  
- Displays indexed words with their document occurrences.  
- Returns a list of documents containing all query keywords.  

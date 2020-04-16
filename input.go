package main

import (
    "fmt"
    "os"
)

func main() {
    data := "Hello go"
    f, _ := os.Create("data_go.txt")

    var num int
    fmt.Scan(&num)

    for i := 0; i < num; i++ {
        fmt.Println(data)
        f.WriteString(data+"\n")
    }
    f.Close()
}
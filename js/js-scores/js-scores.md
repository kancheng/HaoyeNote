# js-scores
JS & CSS Toy

## Details

測試 JS 改變 DIV HTML 標籤的 Class & Style。

P.S : 範例程式來源為學校老師的程式範例修改而來。

```
<html>
    <body>
        <button onclick="myFunction()">輸入成績</button>
        <p id="demo"></p>
        <script>
            function myFunction() {
                var z = prompt();
                if (z>=90) {
                    document.getElementById("demo").innerHTML = "分數" + z + "，等級A";
                } else if (z >= 80) {
                    document.getElementById("demo").innerHTML = "分數" + z + "，等級B";
                } else if (z >= 70) {
                    document.getElementById("demo").innerHTML = "分數" + z + "，等級C";
                } else if (z >= 60) {
                    document.getElementById("demo").innerHTML = "分數" + z + "，等級D";
                } else if (z < 60) {
                    document.getElementById("demo").innerHTML = "分數" + z + "，等級E";
                }
            }
        </script>
    </body>
</html>
```

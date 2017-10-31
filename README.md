# httpclient
接口测试工具 尚未完成所有测试/某些功能未实现

# 使用说明
app task_file

# task 格式
```$xslt
// 支持//开头的注释
task {
  url = "http://baidu.com"
  method = "get"
  param {
    key1 : "value1"
    key2 : "value2"
  }
  
  cookie { 
    file = "cookie save file" // 未实现
    set-cookie : "cookie valule"
    set-cookie : "cookie value2"
  }
  
  body {  // 所用其中一种方式
    form_data {
       name : @"file"
       key : "value"
       key " "value2"
    }
    form_urlencode {
      key : "value"
      key2 : "value2"
    }
    
    raw {  // 支持 text json pdf html  @"" 为引用文件明
      text : "oeee"
      text " @"file"
      json : "nnnttn"
    }
  }
}

```

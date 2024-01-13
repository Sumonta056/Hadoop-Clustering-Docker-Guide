
<div align = "center">

*------ **🧠 For Lab Exam : This step are enough 🧠** ------*

# 🌲 Hadoop Clusterting using Docker

#### ✍️ Follow Every Blog Instruction of [মেহরাজুল ইসলাম](https://github.com/codermehraj) :  **([👉Click Here](https://medium.com/@genius_meringue_gnat_79/running-single-node-mapreduce-using-docker-and-hadoop-cluster-41f5ec5b7650))**

<hr>

*------ **🎥 Video Tutorial of Blog : [Rifat Shariar Sakil](https://github.com/Rifat-Shariar-Sakil-24) 🎥** ------*

##### ✍️ Video of Blog Steps 1 - 5 :  **([👉Click Here](https://drive.google.com/file/d/1iZnPTpOrcLlHRYkJSsV6CM2Q6uVYBkd-/view))**


##### ✍️ Video of Blog Steps 6 - 10 :  **([👉Click Here](https://drive.google.com/file/d/10Kw1I6i2ZpSQk_zM7vces1um3EswGm5z/view))**


##### ✍️ Video of Blog Steps 11 - 13 :  **([👉Click Here](https://drive.google.com/file/d/1Bf86YzzApHFwgcdfMCncI0uAsLtskO_Z/view))**


</div>

<hr>


<div align = "center">

*-- **🧠 Do The Below Steps if only want to see how hadoop works 🧠** --*

# 🎥 Tutorial Installation of Hadoop

#### 🧠 Follow Every Instruction Carefully  **([👉Click Here](https://youtu.be/knAS0w-jiUk?si=DffG6Zoubzt2Dad3))**

</div>

<hr>

<div align = "center">

## ✅ Download Links

</div>

#### 🧠 Java - 8 (Must Needed) : **([👉Click Here](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html#license-lightbox))**

#### 🧠 Apache Hadoop : **([👉Click Here](https://hadoop.apache.org/releases.html))**

#### 🧠 Notepad++ Editor : **([👉Click Here](https://notepad-plus-plus.org/downloads/))**

#### 🧠 Hadoop Fixed Bin Folder : **([👉Click Here](https://drive.google.com/file/d/1nCN_jK7EJF2DmPUUxgOggnvJ6k6tksYz/view))**

#### 🧠 Microsoft Visual C++ Redistributable : **([👉Click Here](https://drive.google.com/file/d/1nCN_jK7EJF2DmPUUxgOggnvJ6k6tksYz/view))**

<hr>

<div align = "center">

## 👩‍💻 Code : Setting up Hadoop **([👉Click Here](https://learn.microsoft.com/en-us/cpp/windows/latest-supported-vc-redist?view=msvc-170))**

</div>

#### **👉 For core-site.xml**

```
<property>
  <name>fs.defaultFS</name>
  <value>hdfs://localhost:9000</value>
</property>
```
<hr>

#### **👉 For mapred-site.xml**

```
<property>
  <name>mapreduce.framework.name</name>
  <value>yarn</value>
</property>

```
<hr>

#### **👉 For hdfs-site.xml or https-site.xml**

```
<property>
  <name>dfs.replication</name>
  <value>1</value>
</property><property>
  <name>dfs.namenode.name.dir</name>
  <value>C:\hadoop\data\namenode</value>
</property><property>
  <name>dfs.datanode.data.dir</name>
  <value>C:\hadoop\data\datanode</value>
</property>
```
<hr>

#### **👉 For yarn-site.xml**

```
<property>
  <name>yarn.nodemanager.aux-services</name>
  <value>mapreduce_shuffle</value>
</property><property>
  <name>yarn.nodemanager.auxservices.mapreduce.shuffle.class</name>
  <value>org.apache.hadoop.mapred.ShuffleHandler</value>
</property>
```

<hr>

<div align = "center">

## ✅ Testing : Haadoop Properly Installed or Not

</div>


### **Method - 1 : 👉 Opem CMD Terminal**

```
hdfs namenode -format
```
```
cd \
```
```
cd hadoop
```
```
cd sbin
```
```
start-dfs.cmd
```
```
cd jps
```
```
start-yarn.cmd
```
```
cd jps
```

<hr>

### **Method - 2 : 👉 Download The Folder and Run The Project in Intellij**

##### 🧠 Video Link of Class **([👉Click Here](https://drive.google.com/file/d/1VMzOIztVlbw-2wOt8s-h7RB8AC0ld7th/view))**

##### 🧠 Project Code **([👉Click Here](https://github.com/CosmicBeing09/Hadoop-Demo-Word-Count-with-Java-and-Maven))**
<hr>

<div align = "center">

# 🎥 Docker Installation 

### 🧠 Install Docker on Window 11  **([👉Click Here](https://youtu.be/WDEdRmTCSs8?si=8gRvkju3qT8o3mox))**


##### 🧠 Docker Guide and Basic Information **([👉Click Here](https://youtu.be/31k6AtW-b3Y?si=ftTXqU15KWkAtKyP))**

</div>

<hr>
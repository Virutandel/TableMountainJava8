node{
    stage('Table Mountain'){
        
          git 'https://github.com/Virutandel/TableMountainJava8'
    }
    
    stage('Compile-Package'){
        def mvnHome = tool name: 'M3', type: 'maven'
        sh "${mvnHome}/bin/mvn install"
    }
}

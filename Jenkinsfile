node{
    stage('Table Mountain'){
        
          git 'https://github.com/Virutandel/TableMountainTest'
    }
    
    stage('Compile-Package'){
        def mvnHome = tool name: 'M3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}

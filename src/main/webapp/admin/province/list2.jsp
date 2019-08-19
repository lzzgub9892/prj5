<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
<div id="app">
p
<SELECT id="p" NAME="" v-on:change="fillC($event.target.selectedIndex)" >
<option v-for="p in json">{{p.pname}}</option>
</SELECT>
c
<SELECT id="c" NAME="" @change="fillZ($event.target.selectedIndex)">
<option v-for="c in citys">{{c.cname}}</option>
</SELECT>
z
<SELECT id="z" NAME="">
<option v-for="z in zones">{{z.zname}}</option>
</SELECT>
</div>
<script>
	window.onload = function(){
	    var vm = new Vue({
	        el:'#app',
	        data:{
	            json:'',
	            citys:'',
	            zones:''
	   	    },
	        mounted:function(){
	        	this.fillP();
	        },
	        methods:{
	        	fillP:function(){
	            	this.$http({
	                	method:'post',
	                	url:'findAll',
	                	emulateJSON:true, 
	                	params:{
	                	},	
	                }).then(function(res){
	                	 this.json=res.body;
	                	 this.fillC(0);
	                },function(){
	                    console.log('请求失败处理');
	                });
	            },
	            fillC:function(obj){
	            	this.citys = this.json[obj].citys;
	            	this.fillZ(0);
	            },
	            fillZ:function(obj){
	            	this.zones = this.citys[obj].zones;
	            }
	            
	        }
	    });
	}
	
	
</script>
    

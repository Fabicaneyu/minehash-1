/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.monitoramento;

import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Component;
import com.profesorfalken.jsensors.model.components.Components;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Gpu;
import com.profesorfalken.jsensors.model.sensors.Fan;
import com.profesorfalken.jsensors.model.sensors.Load;
import com.profesorfalken.jsensors.model.sensors.Temperature;

import java.io.IOException;
import java.util.List;

public class Consumo {
    
    //Components component = JSensors.get.components();
    public static void main(String[] args) throws IOException {

        /*O comando: JSensors.get.components() retorna uma classe abstrata,
            Components, e nos da várias opções como:
            component.cpus
            component.disks
            component.gpus
            component.mobos
        Cada um retornando uma lista de cada classe especifica (CPU, Disco, GPU,
        Mobos)
            O comando abaixao poderia ser substituido por:
            List<Gpu> gpus = JSensors.get.components().gpus;
            Ou por cada componente. Mas isto só se vcs precisarem pegar de apenas 
            um componente, deixaria a aplicação mais rápida
         */
        Components component = JSensors.get.components();

        List<Gpu> gpus = component.gpus;
        List<Cpu> cpus = component.cpus;

        /*
            Para cada item da lista, podemos acessar outra classe, Sensors, esta,
            que também retorna uma lista, retornando valores como temperatura, 
            utilização e velocidade.
        
            Estas listas não são de valores fixos, podendo variar de computador
            para computador.
         */
 /*
            Quando falamos de temperatura no JSensors, os primeiros indices retornam
            os valores de temperatura de cada núcleo existente em sua CPU;
       
            Agora, o último indice, retorna a temperatura como um todo, o que eu
            acredito que seja uma média de todas as temperaturas;
         */
        // Este seria o valor da temperatura do núcleo 1
        Double tempN1 = cpus.get(0).sensors.temperatures.get(0).value;
        System.out.println("Temperatura núcleo 1: " + tempN1);

        int tamanhoTemp = cpus.get(0).sensors.temperatures.size();

        // Este seria o valor da temperatura de toda a CPU
        Double tempMedia = cpus.get(0).sensors.temperatures.get(tamanhoTemp - 1).value;
        System.out.println("Temperatura CPU: " + tempMedia);

        //Especifiquei desta forma para vcs entenderem como pode ser melhor para 
        //trabalharem. Caso queiram trabalhar com temperatura de cada núcleo, 
        //podem fazer assim:
        for (Cpu atual : cpus) {
            System.out.println("Nome CPU: " + atual.name);
            lerTemperatura(atual);
            lerUtilizacao(atual);
            lerVelocidade(atual);
        }

        //Lembrando que este código irá servir para qualquer componente, seja
        //CPU ou GPU
    }

    public static void lerTemperatura(Component component) {

        //Verificando se a lista dos sensores do componente não é vazia
        if (component.sensors != null) {

            List<Temperature> temperatura = component.sensors.temperatures;

            for (final Temperature tempAtual : temperatura) {
                //tempAtual.name = É o nome do que está pegando, podendo ser a
                //temperatura de um núcleo ou a temperatura média da CPU(ultimo indice)
                System.out.println(tempAtual.value);
            }

            //Relembrando... caso queira só a última temperatura, pode ser assim:
            //temperatura.get(temperatura.size() - 1).value;
        }

    }

    private static void lerUtilizacao(Component component) {
        if (component.sensors != null) {

            List<Load> loads = component.sensors.loads;
            for (final Load atualLoad : loads) {
                System.out.println("3:" + atualLoad.name + ": " + atualLoad.value);
            }

        }
    }

    private static void lerVelocidade(Component component) {
        if (component.sensors != null) {

            List<Fan> fans = component.sensors.fans;
            for (final Fan atualFan : fans) {
                System.out.println("3:" + atualFan.name + ": " + atualFan.value);
            }

        }
    }
    
    
    
}

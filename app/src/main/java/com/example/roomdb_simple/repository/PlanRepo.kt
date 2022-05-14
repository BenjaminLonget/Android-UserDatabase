package com.example.roomdb_simple.repository

import androidx.lifecycle.LiveData
import com.example.roomdb_simple.databasepackage.PlanDao
import com.example.roomdb_simple.model.Plan

class PlanRepo(private val planDao: PlanDao) {
    val readAllData: LiveData<List<Plan>> = planDao.getData()

    suspend fun addPlan(plan: Plan){
        planDao.addPlan(plan)   //køre funktionen fra DAO, køres selv af den i viewmodel
    }

    suspend fun updatePlan(plan: Plan){
        planDao.updatePlan(plan)
    }
    suspend fun deleteEntry(plan: Plan){
        planDao.deleteEntry(plan)
    }

    suspend fun deleteAll(){
        planDao.deleteAll()
    }
}
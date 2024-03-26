package com.example.trying

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from

val supabase = createSupabaseClient(
    supabaseUrl = "https://gfloplcrusukcunzjqep.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImdmbG9wbGNydXN1a2N1bnpqcWVwIiwicm9sZSI6InNlcnZpY2Vfcm9sZSIsImlhdCI6MTcxMTA3OTk5MSwiZXhwIjoyMDI2NjU1OTkxfQ.pMhFMcrEAfRfr-tqnIyWv87MfSxmKPSr7ig9B1zYRpw"
) {
    install(Postgrest)
}

class Supabase {

    private fun auth() {

    }

     suspend fun insertUser(email: String, password: String) {
         val user = Users(email, password)
         supabase.from("Userss").insert(user)
    }
}
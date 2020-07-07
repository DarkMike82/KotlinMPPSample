//
//  ContentView.swift
//  MPPSample
//
//  Created by mykhailo.dontsov on 04/07/2020.
//  Copyright © 2020 mykhailo.dontsov. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(Settings().greeting())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

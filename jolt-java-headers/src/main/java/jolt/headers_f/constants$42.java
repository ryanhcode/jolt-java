// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor JPC_BoxShape_GetHalfExtent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BoxShape_GetHalfExtent$MH = RuntimeHelper.downcallHandle(
        "JPC_BoxShape_GetHalfExtent",
        constants$42.JPC_BoxShape_GetHalfExtent$FUNC
    );
    static final FunctionDescriptor JPC_TriangleShape_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_TriangleShape_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_TriangleShape_Create",
        constants$42.JPC_TriangleShape_Create$FUNC
    );
    static final FunctionDescriptor JPC_TriangleShape_GetConvexRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_TriangleShape_GetConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_TriangleShape_GetConvexRadius",
        constants$42.JPC_TriangleShape_GetConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_CapsuleShape_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CapsuleShape_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_CapsuleShape_Create",
        constants$42.JPC_CapsuleShape_Create$FUNC
    );
    static final FunctionDescriptor JPC_CapsuleShape_GetRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CapsuleShape_GetRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_CapsuleShape_GetRadius",
        constants$42.JPC_CapsuleShape_GetRadius$FUNC
    );
    static final FunctionDescriptor JPC_CapsuleShape_GetHalfHeightOfCylinder$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CapsuleShape_GetHalfHeightOfCylinder$MH = RuntimeHelper.downcallHandle(
        "JPC_CapsuleShape_GetHalfHeightOfCylinder",
        constants$42.JPC_CapsuleShape_GetHalfHeightOfCylinder$FUNC
    );
}



// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$40 {

    static final FunctionDescriptor JPC_ConvexHullShapeSettings_SetMaxConvexRadius$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_ConvexHullShapeSettings_SetMaxConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexHullShapeSettings_SetMaxConvexRadius",
        constants$40.JPC_ConvexHullShapeSettings_SetMaxConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_ConvexHullShapeSettings_GetMaxErrorConvexRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexHullShapeSettings_GetMaxErrorConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexHullShapeSettings_GetMaxErrorConvexRadius",
        constants$40.JPC_ConvexHullShapeSettings_GetMaxErrorConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_ConvexHullShapeSettings_SetMaxErrorConvexRadius$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_ConvexHullShapeSettings_SetMaxErrorConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexHullShapeSettings_SetMaxErrorConvexRadius",
        constants$40.JPC_ConvexHullShapeSettings_SetMaxErrorConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_ConvexHullShapeSettings_GetHullTolerance$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_ConvexHullShapeSettings_GetHullTolerance$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexHullShapeSettings_GetHullTolerance",
        constants$40.JPC_ConvexHullShapeSettings_GetHullTolerance$FUNC
    );
    static final FunctionDescriptor JPC_ConvexHullShapeSettings_SetHullTolerance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_ConvexHullShapeSettings_SetHullTolerance$MH = RuntimeHelper.downcallHandle(
        "JPC_ConvexHullShapeSettings_SetHullTolerance",
        constants$40.JPC_ConvexHullShapeSettings_SetHullTolerance$FUNC
    );
    static final FunctionDescriptor JPC_HeightFieldShapeSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_HeightFieldShapeSettings_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_HeightFieldShapeSettings_Create",
        constants$40.JPC_HeightFieldShapeSettings_Create$FUNC
    );
}


